/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 *
 * @author dancye, 2019
 *
 * Student Name: Edwin Natnat Jr
 * Student Number: 991526343
 */
public class CardDealer
{
   public static void main (String[] args)
   {
      Card call = new Card("diamonds", 5);
      Card nineClubs = new Card("Clubs", 9);
      nineClubs.setSuit("diamonds");
      System.out.println(call);
   }
}
