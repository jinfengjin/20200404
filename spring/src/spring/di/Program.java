package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {

		/*
		 * 스프링에게 지시하는 방법으로 코드를 변경 Exam exam = new NewlecExam(); //ExamConsole console =
		 * new InlineExamConsole(exam); ExamConsole console = new GridExamConsole();
		 * 
		 * console.setExam(exam);
		 */

		ApplicationContext context = 
//				new ClassPathXmlApplicationContext("spring/di/setting.xml");
				new AnnotationConfigApplicationContext(NewlecDiConfig.class);
		
		
//		Exam exam = context.getBean(Exam.class);
//		System.out.println(exam.toString());

		ExamConsole console = (ExamConsole) context.getBean("console");
//		ExamConsole console = context.getBean(ExamConsole.class);

		console.print();
		
//		List<Exam> exams = (List<Exam>) context.getBean("exams"); //new ArrayList<>();
//		exams.add(new NewlecExam(1,1,1,1));
		
//		new ArrayList();
		
//		for(Exam e : exams)
//			System.out.println(e);
	}

}
