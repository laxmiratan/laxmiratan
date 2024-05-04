package practice.springboot.cards.mapper;

import practice.springboot.cards.dto.CardsDto;
import practice.springboot.cards.entity.Cards;

public class CardsMapper {

    public static CardsDto mapToCardsDto(Cards cards, CardsDto cardsDto){

        cardsDto.setMobileNumber(cards.getMobileNumber());
        cardsDto.setCardNumber(cards.getCardNumber());
        cardsDto.setCardType(cards.getCardType());
        cardsDto.setTotalLimit(cards.getTotalLimit());
        cardsDto.setAmountUsed(cards.getAmountUsed());
        cardsDto.setAvailableAmount(cards.getAvailableAmount());

        return cardsDto;
    }

    public static Cards mapToCards(CardsDto cardsDto, Cards cards){

        cards.setMobileNumber(cardsDto.getMobileNumber());
        cards.setCardNumber(cardsDto.getCardNumber());
        cards.setCardType(cardsDto.getCardType());
        cards.setTotalLimit(cardsDto.getTotalLimit());
        cards.setAvailableAmount(cardsDto.getAvailableAmount());
        cards.setAmountUsed(cardsDto.getAmountUsed());

        return cards;
    }
}
