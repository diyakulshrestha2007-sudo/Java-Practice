import java.util.*;
class Practice {
      
public static void main(String[] args){
    Scanner  sc = new Scanner(System.in);
  int n = sc.nextInt();
  int Sum = 0;
  for(int i=2; i<=n-1; i++){
    if (check(i)){
        Sum+=i;
    }
  }
    System.out.println(Sum);
}

}  
public static boolean check(int num) {
    
        if(num<2){
            return false;
        }
        for(int i=2; i<=num-1; i++){
            if(num%i==0){
                return false;
            }
        }
    
    return true;
}