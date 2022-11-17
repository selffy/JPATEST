package kr.kwangan2.jpatest.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Entity implementation class for Entity: Board
 *
 */

@Entity
@Table(name = "BOARD")
@Data
public class Board {

   @Id
   @GeneratedValue
   private Long seq;
   private String title;
   private String writer;
   private String content;
   private Date createDate;
   private Long cnt;

   public Board() {
      super();
   }

}