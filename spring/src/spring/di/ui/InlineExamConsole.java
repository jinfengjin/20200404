package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component("console")
public class InlineExamConsole implements ExamConsole {



	@Autowired(required = false)
	@Qualifier("exam2")	
	private Exam exam;
	
	public InlineExamConsole() {
		System.out.println("constructor");
	}
	
	public InlineExamConsole(Exam exam) {
		System.out.println("overload constructor");
		this.exam = exam;
	}



	@Override
	public void print() {
		// TODO Auto-generated method stub
		if(exam == null)
			System.out.printf("total is %d, avg is %f\n", 0, 0.0 );
		else 
			System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg() );
	}

	
	@Override
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		System.out.println("setter constructor");
		this.exam = exam;
	}

}
 