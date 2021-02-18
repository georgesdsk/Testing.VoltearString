import static org.junit.jupiter.api.Assertions.*;

class voltearStringTest {

    voltearString vs = new voltearString();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {


    }

    @org.junit.jupiter.api.Test
    void tNull() {


        try{
            vs.voltearString(null, 0,0);

        }catch(Exception ex){

            assertTrue( ex instanceof IllegalArgumentException ) ;
        }



    }

    @org.junit.jupiter.api.Test
    void indiceMayorQueLongitud() {


        try{
            vs.voltearString("hola", 1,5);

        }catch(Exception ex){

            assertTrue( ex instanceof IllegalArgumentException ) ;
        }



    }


    @org.junit.jupiter.api.Test
    void indiceMenorMayorQueMayor() {


        try{
            vs.voltearString("buenas", 5,4);

        }catch(Exception ex){

            assertTrue( ex instanceof IllegalArgumentException ) ;
        }

    }

    @org.junit.jupiter.api.Test
    void inidceMenorNegativo() {


        try{
            vs.voltearString("buenas", -1,5);

        }catch(Exception ex){

            assertTrue( ex instanceof IllegalArgumentException ) ;
        }

    }


    @org.junit.jupiter.api.Test
    void palabraCorrecta() {


        assertEquals("rp", vs.voltearString("aeioupr", 0, 6) );


    }

}