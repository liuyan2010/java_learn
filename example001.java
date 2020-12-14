public class example001{
   public static void main(String args[]){
      StringCompare();
   }

   /*字符串操作*/
   public static void StringCompare(){

      //字符串比较
      String str = "Hello World";
      String anotherString = "hello world";
 
      System.out.println( str.compareTo(anotherString) );
      System.out.println( str.compareToIgnoreCase(anotherString) );  //忽略大小写

      //字符串搜索
      int lastIndex = str.lastIndexOf("rld");
      if(lastIndex == - 1){
         System.out.println("没有找到字符串 rld");
      }else{
         System.out.println("rld 字符串最后出现的位置： "+ lastIndex);
      }

      //字符串替换
      System.out.println( str.replace( 'H','h' ) );

      //字符串反转
      String reverse = new StringBuffer(str).reverse().toString();
      System.out.println("字符串反转后:"+reverse);
 
      //字符串分割
      String[] temp;
      String delimeter = " ";  // 指定分割字符
      temp = str.split(delimeter); // 分割字符串
      for(int i =0; i < temp.length ; i++){
         System.out.println(temp[i]);
      }

      //字符串创建速度比较，通过对象创建比较慢
      long startTime = System.currentTimeMillis();
      for(int i=0;i<5000;i++){
         String s1 = "hello";
         String s2 = "hello"; 
      }
      long endTime = System.currentTimeMillis();
      System.out.println("通过 String 关键词创建字符串" 
      + " : "+ (endTime - startTime) 
      + " 毫秒" );       
      long startTime1 = System.currentTimeMillis();
      for(int i=0;i<50000;i++){
         String s3 = new String("hello");
         String s4 = new String("hello");
      }
      long endTime1 = System.currentTimeMillis();
      System.out.println("通过 String 对象创建字符串" 
      + " : " + (endTime1 - startTime1)
      + " 毫秒");
   }
}
