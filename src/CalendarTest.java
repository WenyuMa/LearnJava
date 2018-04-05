import java.time.*;

public class CalendarTest {
	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		int month=date.getMonthValue();
		int today=date.getDayOfMonth();
		
		date=date.minusDays(today-1); //���ɵ�ǰ����֮���֮ǰn�������
		DayOfWeek weekday=date.getDayOfWeek();
		int value=weekday.getValue();
		
		System.out.println("Mon Tus Wed Thu Fri Sat Sun");
		for(int i=1; i<value; i++)
			System.out.print("    "); //�ĸ��ո�����Mon Ϊ4��λ��
		while(date.getMonthValue()==month)
		{
			System.out.printf("%3d", date.getDayOfMonth());
			if(date.getDayOfMonth()==today)
				System.out.print("*");
			else
				System.out.print(" ");
			date=date.plusDays(1);
			if(date.getDayOfWeek().getValue()==1) //��һ��س�
				System.out.println();			
		}
		if(date.getDayOfWeek().getValue()!=1)
			System.out.println();
	}
	

}
