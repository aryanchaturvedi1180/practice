import java.util.*;
public class cp1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int sum =0;
        for(char ch:input.toCharArray()){
            sum+=ch-'0';
        }
        int a=0;
        int b=1;
        
        if(b==sum){
        System.out.println(input+sum);}
        else{
            System.out.println(input+b);

        }
    }
    
}
