package ru.maliutin.seminar6hw2.sevices;


import ru.maliutin.seminar6hw2.models.Characters;
import ru.maliutin.seminar6hw2.models.Result;

/**
 * Интерфейс сервиса запросов к api.
 */
public interface ServiceApi {
    /**
     * Получение всех персонажей.
     * @return данные о персонажах и метаданные.
     */
    Characters getAllCharacters();

    Characters getAllCharacters(String url);

    /**
     * Получение конкретного персонажа.
     * @param id идентификатор персонажа.
     * @return объект персонажа.
     */
    Result getHero(Integer id);
}
