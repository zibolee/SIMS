/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shrms;

import javax.swing.JOptionPane;

/**
 *
 * @author 泊
 */
/**
 * 创建了一个E_mail类的子类Judge
 *一个 构造方法 —— Judge（String sl，String regex）判断输入的sl是否符合regex要求
 */

public class Judge extends E_mail{
        public void Judge(String sl,String regex){
            if(sl.matches(regex)) {
                JOptionPane.showMessageDialog(null, "输入合法！","消息对话框",JOptionPane.WARNING_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, "输入不合法！","消息对话框",JOptionPane.WARNING_MESSAGE);
                Judge(Sl(),Regex());
                }
            }
}