package kr.kwangan2.jpatest;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import kr.kwangan2.jpatest.entity.Board;

public class JPAClient {
   
   public static void main(String[] args) {
      
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpatest");
      EntityManager em = emf.createEntityManager();
      EntityTransaction tx = em.getTransaction();
      
      try {
    	  //insert
//         tx.begin();
//         
//         Board board = new Board();
//         
//         board.setTitle("승현");
//         board.setWriter("셀피");
//         board.setContent("여수종 하이");
//         board.setCreateDate(new Date());
//         board.setCnt(0L);
//         
//         em.persist(board);
    	  
//    	  //select
//    	  Board board = em.find(Board.class, 3L);
//    	  System.out.println("---->" + board.toString());
    	  
    	  //select
//    	  Board board = em.find(Board.class, 3L);
    	  
    	  //update query
//    	  board.setTitle("수정된 제목");

    	  //remove : delete query
//    	  em.remove(board);
    	  
    	  String jpql = " select b from Board b order by b.seq desc ";
    	  List<Board> boardList = em.createQuery(jpql, Board.class).getResultList();
    	  for(Board board : boardList) {
    		  System.out.println(board);
    	  }
    	  
         tx.commit();
      } catch(Exception ex) {
         ex.printStackTrace();
         tx.rollback();
      } finally {
         em.close();
         emf.close();
      }
      
   }   // main

}   // class