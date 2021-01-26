import java.util.*;

public class task_3 {
  static Scanner sc = new Scanner(System.in);
  static void createRoutine( LinkedList<Routine> list){
    System.out.println("1. English Grammar\n2. Mathematics\n3. Physics\n4. Chemistry\n5. Biology");
    list.add(new Routine(sc.nextInt(),sc.nextInt(),sc.nextInt()));
  }
  static void showRoutine(LinkedList<Routine>list, Info info[]){
    for(int  i=0; i<list.size(); i++){
      System.out.println(list.get(i).day+" "+list.get(i).hr+" "+info[list.get(i).sub].sub_name);
    }
  }   
  static void listCourses(Info info[]){
    for(int i=0; i<info.length; i++){
      System.out.println(info[i].sub_name+", "+info[i].t_name);
    }
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Info info [] = {new Info("English Grammar", "John Smith"), new Info("Mathematics", "Lara Gilbert"), new Info("Physics", "Johanna Kabir"), new Info("Chemistry", "Danniel Robertson"), new Info("Biology", "Larry Cooper")};
    LinkedList<Routine> list = new LinkedList<Routine>(); 
    System.out.println("A. Create Routine\nB. Show Routine\nC. List Courses with Teachers Name");
    while(sc.hasNext()){
      String inp = sc.next();
      if(inp.equalsIgnoreCase("A")){
        createRoutine(list);    
      }
      else if(inp.equalsIgnoreCase("B")){
        showRoutine(list, info);   
      }
      else if(inp.equalsIgnoreCase("C")){
        listCourses(info);
      }
      System.out.println("\nA. Create Routine\nB. Show Routine\nC. List Courses with Teachers Name");
    }
  }
}

class Info{
  String sub_name = "";
  String t_name = "";
  Info(String sub, String name){
    sub_name = sub;
    t_name = name;
  }  
}

class Routine{
  int day=0;
  int hr=0;
  int sub=0;
  Routine(int a, int b, int c){
    day=a;
    hr=b;
    sub=c;
  }
}

