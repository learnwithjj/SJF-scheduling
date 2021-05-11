import java.util.Arrays;
public class ShortestJobFirst
{
	static void sjf(int n,int bt[],int at[])
	{
		Arrays.sort(bt);                     //sorting the burst time to know the shortest jobs
		int ct[]=new int[n];					//completion time array
		int before[]=new int[n+1];				//array to keep track of completion time and previous completion time 
		before[0]=0;							//since process 1 starts from 0		
		for(int i=0;i<n;i++)
		{											
			ct[i]=bt[i]+before[i];
			before[i+1]=ct[i];
		}
		int tat[]=new int[n];					//turn around time array
		int waiting_time[]=new int[n];			//waiting time array
		for(int i=0;i<n;i++)
		{												//turn around time=completion time-arrival time
			tat[i]=ct[i]-at[i];
		}
		for(int i=0;i<n;i++)	
		{														
			waiting_time[i]=tat[i]-bt[i];				//waiting time=turn around time-burst time
		}
		System.out.println("Process  arrival_time  burst_time  turn_around_time  waiting_time");
		int total_tat=0,total_waiting=0;
		for(int i=0;i<n;i++)
		{	
			total_tat+=tat[i];									//total turn around time
			total_waiting+=waiting_time[i];						//total waiting time
			System.out.printf("P%d",i+1);
			System.out.printf("	 %d",at[i]);
			System.out.printf("   		 %d",bt[i]);
			System.out.printf("		 %d",tat[i]);
			System.out.printf("       	 %d\n", waiting_time[i]);
		}
		System.out.println("Average turn around time = "+(total_tat)/n + "ms");				//average turn around time				
		System.out.println("Average waiting time = "+(total_waiting)/n + "ms");				//average waiting time
			
	}
	public static void main(String[] args)
	{
		int n=5;								//number of processors
		int bt[]= {4,3,7,1,2};					//burst time	
		int at[]= {0,0,0,0,0};					//arrival time for all the processors is zero
		sjf(n,bt,at);							//caling the function
	}
}