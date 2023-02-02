/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shrms;
import java.util.Scanner;
/**
 *
 * @author 泊
 */
/**
 * 创建一个E_mail类
 * 包含两个属性 —— sl：用户输入的邮箱地址；regex：邮箱地址的正确格式
 * 包含两个方法 —— Sl：接收键入的邮箱地址；Regex：制定邮箱地址的规则
 */


public class E_mail {
    String sl;
    String regex;
    public String Sl(){    
    Scanner der=new Scanner(System.in);
    System.out.println("输入你的邮箱地址");
    sl=der.nextLine();
    return sl;
        }
    public String Regex() {
        regex="[a-zA-Z0-9_]+@{1}[a-z]+[.]{1}[a-z]+";
        return regex;
        }
}