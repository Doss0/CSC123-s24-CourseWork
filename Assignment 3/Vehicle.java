 public class Vehicle 
    {
        private String vehicle;
        private String ownerName;
        private String ownerAddress;
        private Registration registration;

        public Vehicle(String vehicle, String ownerName, String ownerAddress, Registration registration) 
        {
            this.vehicle = vehicle;
            this.ownerName = ownerName;
            this.ownerAddress = ownerAddress;
            this.registration = registration;
        }

        public String getVehicle() 
        {
            return vehicle;
        }

        public String getOwnerName() 
        {
            return ownerName;
        }

        public String getOwnerAddress() 
        {
            return ownerAddress;
        }
    }
