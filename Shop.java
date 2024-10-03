import java.util.Scanner;
public class Shop {
    private Product productList[]= new Product[500];
    private Person owner;
    private String address;
    private static int productCount=0;
    private static double revenue;
    public Shop(Person owner, String address) {
        this.owner = owner;
        this.address = address;
        this.productList = new Product[100];
    }
    public void addProduct(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Product details");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        System.out.print("Quantity: ");
        int quantity = input.nextInt();
        Product product = new Product(name, price, quantity);
        productList[productCount++]=product;
        System.out.println("Product added");
    }
    public void sale(){
        System.out.println("Sale Menu");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        String id= scanner.nextLine();
        for(int i=0; i<productCount; i++){
            if(productList[i].getId().equals(id))
            {
                productList[i].setQuantity(productList[i].getQuantity()-1);
                revenue+=productList[i].getPrice();
                System.out.println("Sale successful");
            }
            else{
                System.out.println("Product not found");
            }
        }
    }


     public void modifyProduct(){
		System.out.println("enter previous name:");
		Scanner scanners = new Scanner(System.in);
		String inp= scanners.nextLine();
		  for(int i=0; i<productCount; i++){
		if(productList[i].getName().equalsIgnoreCase(inp)){
		System.out.println("enter new name: ");	
		Scanner ss=new Scanner(System.in);
		String ss1 = ss.nextLine();
		productList[i].setName(ss1);
		//Product product1 = new Product(ss1);
               // productList[i]=product1;
		}
	      }
        }




	public void displayProduct(){
	  for(int i=0; i<productCount; i++){
		System.out.println(productList[i]);
	}      

    }  


	public void removeProduct(){
	System.out.println("enter product name to be removed:");
	Scanner hehe= new Scanner(System.in);
	String nm = hehe.nextLine();
	for(int j=0; j<productCount; j++){
	if(productList[j].getName().equalsIgnoreCase(nm))
{	productList[j] = null;	}}
	}
}




      








