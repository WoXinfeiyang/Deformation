import java.util.Scanner;

/**
 * 文件名称：判断两个字符串是否互为变形词
 * 时间：2016-8-31 22:03
 * 说明：1、题目：给定两个字符串str1和str2,如果两个字符串str1和str2中出现的字符种类
 * 相同并且每个字符出现的次数也相同，那么这两个字符串str1和str2互为变形词。
 * */
public class Deformation {
	
	public static boolean isDeformation(String str1,String str2)
	{
		if((str1==null)||(str2==null)||(str1.length()!=str2.length())){
			return false;
		}
		int[]map=new int[256];
		int i=0;
		for(i=0;i<256;i++){
			map[i]=0;
		}
		
		for(i=0;i<str1.length();i++){
			map[str1.charAt(i)]++;
		}
		
		for(i=0;i<str2.length();i++){
			map[str2.charAt(i)]--;
			if(map[str2.charAt(i)]<0){
				return false;
			}
		}	
		
		return true;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String str1=in.nextLine();
			String str2=in.nextLine();
			System.out.println(isDeformation(str1, str2));
		}
		
	}

}
