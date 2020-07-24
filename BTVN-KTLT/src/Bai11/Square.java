package Bai11;

public class Square {
    private double edge;

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
    public void acreage(){
        System.out.println("Diện tích hình vuông canh : " + this.getEdge() + " là : " + Math.pow(this.edge,4));
    }
    public void perimeter(){
        System.out.println("Chu vi hình vuông cạnh " + this.getEdge() + " là : " + this.getEdge()*4);
    }
    public void pain(){
        int age = (int)Math.round(this.edge);
        for (int i = 0; i < age; i++) {
            for (int j = 0; j < age; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
