
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.io.FileOutputStream;
import java.util.Scanner;
public class MathExam6385 {
	public static void main(String[] args) throws IOException {
		for(;;) {
			Scanner input=new Scanner(System.in);
			System.out.println("请输入问题数目和所需年级：");		
			int []z =new int [args.length];									
			z[0] = Integer.parseInt(args[0]);
			z[1] = Integer.parseInt(args[1]);
		    int n =z[0];
		    //int n = input.nextInt();
			int m =z[1];
			//int m = input.nextInt();
			if(n<=0||m<=0) {										//判断输入的数是否大于0
				System.out.println("请输入大于0的正整数");
				args[0]=input.next();
				//n = input.nextInt();
				args[1]=input.next();
				//m = input.nextInt();
				continue;
			}
			FileOutputStream in =new FileOutputStream("out.txt");	

			for(int i=0;i<7;i++){												
			int a=0;
			int b=0;
			int c=0;
			Random r1 = new Random();
			BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
			String str1 = null;
			boolean f=true;
			boolean result=true;
			while(f){
				while (result){
					a=r1.nextInt(10);//定义只产生10以内的随机数
					b=r1.nextInt(10);
					int q=r1.nextInt(4);
					if(a>=b&&q==0){
						c=a-b;
						System.out.println("("+(i+1)+")"+a+"-"+b+"=");

						i++;
						}
					else if(q==1||(a<b&&q==0)){
						c=a+b;
						System.out.println("("+(i+1)+")"+a+"+"+b+"=");	

						i++;
						}
					else if(q==2){
						c=a*b;
						System.out.println("("+(i+1)+")"+a+"x"+b+"=");	

						i++;
						}
					else if(q==3){
						c=a/b;
						System.out.println("("+(i+1)+")"+a+"÷"+b+"=");	

						i++;
						}
					}
				}
				String pa ="\r\n";
				byte[] ta = pa.getBytes(); 
				in.write(ta);
			}String wa  ="---------标准答案----------"+"\r\n";
			System.out.print(wa);
			byte[] ea =wa.getBytes();
			in.write(ea);


					String ua="......";
					byte[] ya =ua.getBytes();
					in.write(ya);

					}
		FileOutputStream in =new FileOutputStream("out.txt");
			String pa ="\r\n";
				byte[] ta = pa.getBytes();
				in.write(ta);
				}
		}


		