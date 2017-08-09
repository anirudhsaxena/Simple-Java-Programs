//Area of triangle

class AreaOfTriangle{
	public static void main(String[]args){
	double area;
	int sideA=12,sideB=10,sideC=8,s;
	
		s=(sideA+sideB+sideC)/2;

		area=(s*(s-sideA)*(s-sideB)*(s-sideC));
		area=math.sqrt(area);
		System.out.println("Area of this triangle:"+area);
	}
}