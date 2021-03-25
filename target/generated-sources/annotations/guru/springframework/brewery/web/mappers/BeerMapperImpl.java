package guru.springframework.brewery.web.mappers;

import guru.springframework.brewery.domain.Beer;
import guru.springframework.brewery.domain.BeerInventory;
import guru.springframework.brewery.web.model.BeerDto;
import guru.springframework.brewery.web.model.BeerStyleEnum;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.Set;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-25T18:49:10+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 14.0.2 (Oracle Corporation)"
)
@Component
public class BeerMapperImpl implements BeerMapper {

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        UUID id = null;
        Integer version = null;
        OffsetDateTime createdDate = null;
        OffsetDateTime lastModifiedDate = null;
        String beerName = null;
        BeerStyleEnum beerStyle = null;
        Long upc = null;
        Integer quantityOnHand = null;
        BigDecimal price = null;

        BeerDto beerDto = new BeerDto( id, version, createdDate, lastModifiedDate, beerName, beerStyle, upc, quantityOnHand, price );

        return beerDto;
    }

    @Override
    public Beer beerDtoToBeer(BeerDto beerDto) {
        if ( beerDto == null ) {
            return null;
        }

        UUID id = null;
        Long version = null;
        Timestamp createdDate = null;
        Timestamp lastModifiedDate = null;
        String beerName = null;
        BeerStyleEnum beerStyle = null;
        Long upc = null;
        Integer minOnHand = null;
        Integer quantityToBrew = null;
        BigDecimal price = null;
        Set<BeerInventory> beerInventory = null;

        Beer beer = new Beer( id, version, createdDate, lastModifiedDate, beerName, beerStyle, upc, minOnHand, quantityToBrew, price, beerInventory );

        return beer;
    }
}
