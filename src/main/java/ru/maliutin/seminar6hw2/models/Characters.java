package ru.maliutin.seminar6hw2.models;

import lombok.Data;

import java.util.List;

/**
 * Сущность с данными о персонажах.
 */
@Data
public class Characters {
     /**
      * Данные о пагинации.
      */
     Info info;
     /**
      * Список персонажей.
      */
     List<Result> results;
}
