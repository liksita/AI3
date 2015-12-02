package de.hawhamburg.microservices.core.price.product;

import de.hawhamburg.microservices.composite.price.model.CalculatedPrice;
import de.hawhamburg.microservices.composite.price.service.PriceCompositeIntegration;
import de.hawhamburg.microservices.core.price.jpa.domain.Price;
import org.junit.Before;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.testng.annotations.Test;

import java.util.UUID;


public class PriceCompositeServiceUnitTests {

    private PriceCompositeIntegration priceCompositeIntegration;

    private UUID id1 = UUID.fromString("0b4acc1d-3439-4b67-905a-1f7a4bb692ca");
    Price basicPrice = new Price.PriceBuilder().withFlightId(id1).withValue(100).build();

    private CalculatedPrice calculatedPrice;

    @Before
    public void init(){
        this.priceCompositeIntegration = new PriceCompositeIntegration();
        this.calculatedPrice = new CalculatedPrice(basicPrice);
    }

    //Tests fuer PriceCompositeIntegration

    @Test
    public void TestGetPrice() {

        UUID id1;
        UUID id2;
        UUID id3;

        Price price1;
        Price price2;
        Price price3;

        ResponseEntity<Price> response1;
        ResponseEntity<Price> response2;
        ResponseEntity<Price> response3;

        //UUID anlegen
        id1 = UUID.fromString("0b4acc1d-3439-4b67-905a-1f7a4bb692ca");
        id2 = UUID.fromString("1b4acc1d-3439-4b67-905a-1f7a4bb692cb");
        id3 = UUID.fromString("2b4acc1d-3439-4b67-905a-1f7a4bb692cc");
        //Preisobjekt mit Preis:100 und einer UUID anlegen
        price1 = new Price.PriceBuilder().withFlightId(id1).withValue(100).build();
        price2 = new Price.PriceBuilder().withFlightId(id2).withValue(200).build();
        price3 = new Price.PriceBuilder().withFlightId(id3).withValue(300).build();
        //Preis Ausgaben erzeugen
        response1 = new ResponseEntity<>(price1, HttpStatus.OK);
        response2 = new ResponseEntity<>(price2, HttpStatus.OK);
        response3 = new ResponseEntity<>(price3, HttpStatus.OK);

        //Objekte & Methoden mocken
        priceCompositeIntegration = Mockito.mock(PriceCompositeIntegration.class);

        //Preise speichern
        priceCompositeIntegration.createPrice(price1);
        priceCompositeIntegration.createPrice(price2);
        priceCompositeIntegration.createPrice(price3);

//        Mockito.when(priceCompositeIntegration.getPrice(id1).getBody()).thenReturn(response1.getBody());

//        Mockito.when(priceCompositeIntegration.getPrice(id1).getStatusCode()).thenReturn(response1.getStatusCode());
//        Mockito.when(priceCompositeIntegration.getPrice(id1).getBody()).thenReturn(response1.getBody());
//        Mockito.when(priceCompositeIntegration.getPrice(id2).getStatusCode()).thenReturn(response2.getStatusCode());
//        Mockito.when(priceCompositeIntegration.getPrice(id2).getBody()).thenReturn(response2.getBody());
//        Mockito.when(priceCompositeIntegration.getPrice(id3).getStatusCode()).thenReturn(response3.getStatusCode());
//        Mockito.when(priceCompositeIntegration.getPrice(id3).getBody()).thenReturn(response3.getBody());




    }

    @Test
    public void TestCreatePrice() {

        UUID id1;
        UUID id2;
        UUID id3;

        Price price1;
        Price price2;
        Price price3;

        ResponseEntity<Price> response1;
        ResponseEntity<Price> response2;
        ResponseEntity<Price> response3;

        //UUID anlegen
        id1 = UUID.fromString("0b4acc1d-3439-4b67-905a-1f7a4bb692ca");
        id2 = UUID.fromString("1b4acc1d-3439-4b67-905a-1f7a4bb692cb");
        id3 = UUID.fromString("2b4acc1d-3439-4b67-905a-1f7a4bb692cc");
        //Preisobjekt mit Preis:100 und einer UUID anlegen
        price1 = new Price.PriceBuilder().withFlightId(id1).withValue(100).build();
        price2 = new Price.PriceBuilder().withFlightId(id2).withValue(200).build();
        price3 = new Price.PriceBuilder().withFlightId(id3).withValue(300).build();
                //Preis Ausgaben erzeugen
        response1 = new ResponseEntity<>(price1, HttpStatus.OK);
        response2 = new ResponseEntity<>(price2, HttpStatus.OK);
        response3 = new ResponseEntity<>(price3, HttpStatus.OK);

//        //Objekte & Methoden mocken
        priceCompositeIntegration = Mockito.mock(PriceCompositeIntegration.class);
        Mockito.when(priceCompositeIntegration.createPrice(price1).getStatusCode()).thenReturn(HttpStatus.OK);
//        Mockito.when(priceCompositeIntegration.createPrice(price2)).thenReturn(response2);
//        //Tests
//        Assert.assertEquals(response3, priceCompositeIntegration.createPrice(price3));
    }

    @Test public void TestPutPrice() {
        UUID id1;
        UUID id2;
        UUID id3;

        Price price1;
        Price price2;
        Price price3;

        ResponseEntity<Price> response1;
        ResponseEntity<Price> response2;
        ResponseEntity<Price> response3;

        //UUID anlegen
        id1 = UUID.fromString("0b4acc1d-3439-4b67-905a-1f7a4bb692ca");
        id2 = UUID.fromString("1b4acc1d-3439-4b67-905a-1f7a4bb692cb");
        id3 = UUID.fromString("2b4acc1d-3439-4b67-905a-1f7a4bb692cc");
        //Preisobjekt mit Preis:100 und einer UUID anlegen
        price1 = new Price.PriceBuilder().withFlightId(id1).withValue(100).build();
        price2 = new Price.PriceBuilder().withFlightId(id2).withValue(200).build();
        price3 = new Price.PriceBuilder().withFlightId(id3).withValue(300).build();
        //Preis Ausgaben erzeugen
        response1 = new ResponseEntity<>(price1, HttpStatus.OK);
        response2 = new ResponseEntity<>(price2, HttpStatus.OK);
        response3 = new ResponseEntity<>(price3, HttpStatus.OK);
//        //Objekte & Methoden mocken
//        priceCompositeIntegration = Mockito.mock(PriceCompositeIntegration.class);
//        priceCompositeIntegration.putPrice(price1);
//        Mockito.when(priceCompositeIntegration.getPrice(id1)).thenReturn(response1);
    }


    //Tests fuer CalculatedPrice

    @Test public void TestCalculatePriceFirstClassByInternet() {

        UUID id1;
        id1 = UUID.fromString("0b4acc1d-3439-4b67-905a-1f7a4bb692ca");
        Price firstClassPriceByInternet = new Price.PriceBuilder().withFlightId(id1).withValue(150).build();

        calculatedPrice = Mockito.mock(CalculatedPrice.class);

        Mockito.when(calculatedPrice.getFirstClassPriceByInternet()).thenReturn(firstClassPriceByInternet.getValue());


    }
}
