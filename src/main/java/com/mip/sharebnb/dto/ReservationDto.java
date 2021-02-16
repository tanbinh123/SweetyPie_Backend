package com.mip.sharebnb.dto;

import com.mip.sharebnb.model.AccommodationPicture;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDto {

    private Long memberId;

    private Long accommodationId;

    private Long reservationId;

    @FutureOrPresent(message = "체크인은 현재날짜 이후의 날짜이어야 합니다.")
    private LocalDate checkInDate;

    @FutureOrPresent(message = "체크아웃은 현재날짜 이후의 날짜이어야 합니다.")
    private LocalDate checkoutDate;

    @Size(min = 1, max = 8, message = "총 인원은 최소 1명에서 최대 8명입니다.")
    private int totalGuestNum;

    @Min(value = 1, message = "성인 인원은 최소 1명입니다.")
    private int adultNum;

    private int childNum;

    private int infantNum;

    @Positive(message = "총 비용이 맞지 않습니다.")
    private int totalPrice;

    private Boolean isWrittenReview;

    private String city;

    private String gu;

    private String title;

    private String hostName;

    private int bathroomNum;

    private int bedroomNum;

    private int bedNum;

    private float ratingAvg;

    private int reviewNum;

    private int pricePerDay;

    private AccommodationPicture accommodationPicture;

}
