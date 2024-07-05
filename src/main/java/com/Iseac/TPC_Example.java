package com.Iseac;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TPC_Example {

	public static void main(String[] args) {
		Transaction tr = null;
		System.out.println("berore ses factory");
		try(Session ses=HBUtil.getSessionFactory().openSession()){
			System.out.print("after ses factory");
			tr=ses.beginTransaction();
			Employee e1=new Employee("Ramesh");
			RegEmployee e2=new RegEmployee(5500,"sales","Suresh");
			Trainee e3=new Trainee(200,"6 months","Umesh");
			
			ses.persist(e1);
			ses.persist(e2);
			ses.persist(e3);
			tr.commit();
			ses.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
