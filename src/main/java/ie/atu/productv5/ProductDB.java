package ie.atu.productv5;

public class ProductDB {

    public static Productable getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Productable p = null;

        if (productCode.equalsIgnoreCase("java"))
        {
           Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = myBook;
        }


        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            p = mySoftware;
        }


        if (productCode.equalsIgnoreCase("pink")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here");
            myMusic.setArtist("Pink Floyd");
            myMusic.setLabel("Part of the Columbia Group");
            myMusic.setPrice(8.00);
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("kdl43")) {
            Tv myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("SONY BRAVIA SMART TV KDL43WF663 by Sony");
            myTv.setScreenSize("55");
            myTv.setPrice(819.00);
            p = myTv;
        }
        if (productCode.equalsIgnoreCase("dog")) {
            Dog myDog = new Dog();
            myDog.setType("Dog");
            myDog.setAge("12");
            myDog.setBreed("Bulldog");
            myDog.setPrice(420.00);
            myDog.setVaccination(true);
            myDog.setShedding("Regular");
            myDog.setNeutered(true);
            p = myDog;
        }
        else if (productCode.equalsIgnoreCase("horse")) {
                Horse myHorse = new Horse();
                myHorse.setType("Horse");
                myHorse.setAge("12");
                myHorse.setBreed("Cheshire Pony");
                myHorse.setPrice(420.00);
                myHorse.setDam("FemaleHorse");
                myHorse.setSire("Stallion");
                myHorse.setHeight(2.3);
                p = myHorse;
        }
        return p;
    }
}

