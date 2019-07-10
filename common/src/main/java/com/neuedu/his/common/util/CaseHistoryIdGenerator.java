package com.neuedu.his.common.util;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 给病例数据生成主键
 */
public class CaseHistoryIdGenerator {
    //原子类型
    private static AtomicInteger seq=new AtomicInteger(0);
    //dateFormat
    private static SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
    //原子引用类型（String）
    private static AtomicReference<String> strRef=new AtomicReference<>(sdf.format(new Date()));
    /**
     * 生成id的方法
     */
    public  static String genId(){
        updateTime();
        return strRef.get()+seq.getAndIncrement();
    }
    /**
     * 判断当前时间是否和dateStr相等，不相等，就更新日期并且将seq设置为0
     */
    private static void updateTime(){
        String curr=sdf.format(new Date());
        if (!curr.equals(strRef.get())){
            //更新时间
            strRef.set(curr);
            seq.set(0);
        }
    }

    //测试多个线程同时调用
    public static void main(String[] args){
        Thread t1=new Thread(()-> {
            for (; ;){
                System.out.print("t1"+CaseHistoryIdGenerator.genId());
            }
        });
        Thread t2=new Thread(()-> {
            for (; ;){
                System.out.print("t2"+CaseHistoryIdGenerator.genId());
            }
        });
        Thread t3=new Thread(()-> {
            for (; ;){
                System.out.print("t3"+CaseHistoryIdGenerator.genId());
            }
        });
        Thread t4=new Thread(()-> {
            for (; ;){
                System.out.print("t4"+CaseHistoryIdGenerator.genId());
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }



//    private static Date date=new Date();
//    private static String dateStr=null;
//    private static Integer seq=0;

//    //时间戳+数字序列 201807080000 201807080001 201907090000
//    public String gen(){
//        //1、生成新的id时，seq+1,2、日期如果过了一天，
//        //2、获得日期前缀 dateStr
//        String id=genPrefix()+genSuffix();
//        return id;
//    }
//    /**
//     * 生成后缀，给seq补0，同时seq+1
//     */
//    private static String genSuffix(){
//        String suffix=String.format("%04d",seq);
//        seq+=1;
//        return suffix;
//    }
//    //生成前缀20180708
//    private static String genPrefix(){
//        Date current=new Date();
//        SimpleDateFormat sdf=new SimpleDateFormat( "yyyyMMdd");
//        String currStr=sdf.format(current);
//
//        //currStr=20190709 dateStr=20190708
//        if (!currStr.equals(dateStr)){
//            dateStr=currStr;
//            seq=0;
//        }
//        return dateStr;
//    }

}
