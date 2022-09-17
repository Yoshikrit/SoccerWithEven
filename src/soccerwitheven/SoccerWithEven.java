/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerwitheven;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class SoccerWithEven {
    Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreSource source = new ScoreSource();//เปลี่ยนแปลงค่า
        Subscriber sub = new Subscriber();
        SoccerWithEven s = new SoccerWithEven();//รับ score
        source.register(sub);
        source.register(sub);
        while(true){
            System.out.print("Enter Score : ");
            String gg = s.Score();
            //String gg = Score();//if Score is static
            if (!gg.equals("")){
                source.setSourceLine(gg);
            }
            else{
               System.out.println("End");
               break;
            }
        }
    }
    
    public String Score(){
        Scanner sc = new Scanner(System.in);
        String gg = sc.nextLine();
        return gg;
    }
}
