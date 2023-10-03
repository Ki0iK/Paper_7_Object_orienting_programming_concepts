public class Main {
    public static void main(String[] args)
    {
        Product[] prods = new Product [12]; // an array of products - can traverse the array and do something with all products
        prods [0] = new Product (1, 3.4);
        prods [1] = new Product (2, 87.68);
        for (Product p : prods)
            p.print();
        //create a new product
    }
}

class Product // needs to be outside the Main class
{
   // called member variables / fields of class
    int id; // has an id (data that belongs to object of the class)
    double price; // has a price

    // a constructor (down)
    Product (int id, double price) // this id (a parameter function) is different to the previous int id
    {
        // member variable takes param(meter?) value
        this.id = id; // this - specific key word, this.id = / id =
        this.price = price;
    }

    // member function / method
    void print ()
    {
        System.out.println("id: " + id + ", price: " + price);
    }
}