class que10{
    public static void main(String[] args){
      
        
        
    for(int i=1;i<=6;i++){
      char ch='F';
      int n=5;
        
        for(int j=1;j<=6;j++){
            if(j%2==1){
                System.out.print(ch);
                 System.out.print(" ");
                 
                
            }if(j%2==0){
                System.out.print(n);
                System.out.print(" ");
                n=n-2;
            }
            ch--;
            
            
        }
        
        System.out.println( " ");
       
    }
}
}