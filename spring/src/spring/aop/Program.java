package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;
import spring.di.NewlecDiConfig;

public class Program {

	public static void main(String[] args) {


		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/aop/setting.xml");
//				new AnnotationConfigApplicationContext(NewlecDiConfig.class);
		
		Exam exam = (Exam) context.getBean("proxy");

		System.out.printf("total is %d\n", exam.total());
		System.out.printf("total is %f", exam.avg());
		
		
		/*
		Exam exam = new NewlecExam(1, 1, 1, 1);
		
		

		Exam proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), new Class[] { Exam.class },
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

						long start = System.currentTimeMillis();

						Object result = method.invoke(exam, args);

						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						long end = System.currentTimeMillis();
						String message = (end - start) + "ms Ω√∞£¿Ã ∞…∑»æπ¥œ¥Ÿ";

						System.out.println(message);

						return result;
					}
				}
		);
		 */

	}

}
