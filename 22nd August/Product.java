//Q2


public class Product 
{
	int prodId;
    double price;
    int quantity;

    static double totalPrice = 0;

    Product(int prodId, double price, int quantity) 
    {
        this.prodId = prodId;
        this.price = price;
        this.quantity = quantity;
        totalPrice += price * quantity;
    }

    void display() 
    {
        System.out.println("Product ID: " + prodId);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total for this product: " + (price * quantity));
    }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Product[] products = new Product[5];
		 
	     products[0] = new Product(101, 25.50, 2);
	     products[1] = new Product(102, 10.00, 5);
	     products[2] = new Product(103, 15.75, 3);
	     products[3] = new Product(104, 50.00, 1);
	     products[4] = new Product(105, 5.25, 4);
	     
	     System.out.println("Details of Products Purchased:");
	     for(Product product : products)
	     {
	            product.display();
	            System.out.println();
	     }
	     System.out.println("Total Amount to be Paid: " + Product.totalPrice);
	}
}