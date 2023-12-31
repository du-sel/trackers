package com.teamproject.trackers.view.test;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.PeriodicTrigger;
import org.springframework.stereotype.Component;

import com.teamproject.trackers.biz.followSubscribeLike.SubscribePurchaseService;
import com.teamproject.trackers.biz.followSubscribeLike.SubscribePurchaseVO;

@Component
public class ReqPaymentScheduler {
	
	//스케줄러
	/*
    private ThreadPoolTaskScheduler scheduler;
    
	@Autowired
	SchedulePayment setSchedulePay;
	
	@Autowired 
	SubscribePurchaseService subscribePurchaseService;

	
	
	
    public void stopScheduler() {
    	//구독 취소 시 scheduler shutdown을 통해 결제 요청 멈춤
        scheduler.shutdown();
    }
 
    public void startScheduler(long customer_uid, int price, long packageId) {
        scheduler = new ThreadPoolTaskScheduler();
        scheduler.initialize();
        // 스케쥴러가 시작되는 부분 
        scheduler.schedule(getRunnable(customer_uid, price, packageId), getTrigger());
    }
    
    public static java.sql.Date convertFromJAVADateToSQLDate(
            java.util.Date javaDate) {
        java.sql.Date sqlDate = null;
        if (javaDate != null) {
            sqlDate = new Date(javaDate.getTime());
        }
        return sqlDate;
    }
 
    private Runnable getRunnable(long customer_uid, int price, long packageId){
    	//System.out.println("subscribePurchaseService: "+subscribePurchaseService);
    	//System.out.println("packageId: "+packageId);
    	//System.out.println("customer_uid: "+customer_uid);
    	//System.out.println("utilDate: "+subscribePurchaseService.getSubscribePurchase(packageId, customer_uid).getPayDate());
    	//java.util.Date utilDate = subscribePurchaseService.getSubscribePurchase(packageId, customer_uid).getPayDate();
    	
    	java.util.Date utilDate = new java.util.Date();
    	System.out.println("utilDate: "+utilDate);
    	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    	System.out.println("simpleDateFormat: "+simpleDateFormat);
        String formattedDate = simpleDateFormat.format(utilDate);
        
    	Date date = java.sql.Date.valueOf(formattedDate);
    	
    	
    	Calendar cal = Calendar.getInstance();
    	cal.setTime(date);
    	cal.add(Calendar.MONTH, 1);
    	cal.add(Calendar.DATE, 1);
    	Date s = convertFromJAVADateToSQLDate(cal.getTime());
        return () -> {
        	setSchedulePay.schedulePay(customer_uid, price);
        	
        	SubscribePurchaseVO vo = new SubscribePurchaseVO();
        	vo.setId(customer_uid);
        	vo.setSubscribeId(packageId);
        	vo.setPayment(String.valueOf(customer_uid));
        	vo.setPayDate(s);
        	subscribePurchaseService.insertSubscribePurchase(vo);
        };
    }
 
    private Trigger getTrigger() {
        // 작업 주기 설정 
        return new PeriodicTrigger(10, TimeUnit.MINUTES);
        // 한달 주기
        //return new PeriodicTrigger(LocalDateTime.now().with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth(), TimeUnit.DAYS););
    }
    */
}
