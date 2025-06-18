// A program to demonstrate use of nested classes, access modifiers and anonymous classes

//class Build
class Build {
    /** 
     * main - entrypoint of program
     * @args: command line arguments 
    */
    public static void main(String[] args) {
        Building newBuilding1 = new Building(BuildingType.BUNGALOW);
        Building newBuilding2 = new Building(BuildingType.BUNGALOW, 5);
        Building newBuilding3 = new Building(BuildingType.DUPLEX, 5);
        Building newBuilding4 = new Building(BuildingType.DUPLEX, 5, "Spiral");

        //anonymous class
        moreBuildingMethods anonymousNew = new moreBuildingMethods() {
            @Override
            public void about() {
                System.out.println("This program demonstrates the use of nested classes, access modifiers and anonymous classes");
            }
        };

        System.out.println("The number of rooms in newBuilding1 is "+ newBuilding1.getNoOfRooms());
        System.out.println(newBuilding1.getStair());
        System.out.println("The number of rooms in newBuilding2 is " + newBuilding2.getNoOfRooms());
        System.out.println("The type of stairs in newBuilding3 is " + newBuilding3.getStair());
        System.out.println("The type of stairs in newBuilding4 is " + newBuilding4.getStair());
        anonymousNew.about();
    }
}

interface moreBuildingMethods {
    public void about();
}

//class Building
class Building {
    public BuildingType type;
    private int noOfRooms;
    private Staircase Staircase;

    private int DEFAULT_NO_OF_ROOMS = 2;

    //constructor 1
    public Building(BuildingType type) {
        this.type = type;
        this.noOfRooms = DEFAULT_NO_OF_ROOMS;
        if (type == BuildingType.DUPLEX) {
            this.Staircase = new Staircase();
        }
    }
    //constructor 2
    public Building(BuildingType type, int noOfRooms) {
        this.type = type;
        this.noOfRooms = noOfRooms;
        if (type == BuildingType.DUPLEX) {
            this.Staircase = new Staircase();
        }
    }
    //constructor 3
    public Building(BuildingType type, int noOfRooms, String typeOfStaircase) {
        this.type = type;
        this.noOfRooms = noOfRooms;
        if (type == BuildingType.DUPLEX) {
            this.Staircase = new Staircase(typeOfStaircase);
        }
    }

    public String getStair() {
        if (this.Staircase != null) {
            return this.Staircase.getStaircaseType();
        } else {
            return "Bungalow has no stairs";
        }

    }
    public int getNoOfRooms() {
        return this.noOfRooms;
    }

    private class Staircase {
        private String type;

        public Staircase() {
            this.type = "Straight";
        }
        public Staircase(String type) {
            this.type = type;
        } 
        public String getStaircaseType() {
            return this.type;
        }
    }

}
//Enum BuildingType
enum BuildingType {
    BUNGALOW,
    DUPLEX,
}

