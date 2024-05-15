import java.util.Date;

public class Registration extends DMV
    {
        private int ID;
        private Date startDate;
        private Date endDate;
        private Owner[] owners;
        private String vehicle;
        private String licensePlate;

        public Registration(int ID, Date startDate, Date endDate, Owner[] owners, String vehicle, String licensePlate)
        {
            this.ID = ID;
            this.startDate = startDate;
            this.endDate = endDate;
            this.owners = owners;
            this.vehicle = vehicle;
            this.licensePlate = licensePlate;
        }

        public int getID() 
        {
            return ID;
        }

        public Date getStartDate()
        {
            return startDate;
        }

        public Date getEndDate() 
        {
            return endDate;
        }

        public String getVehicle() 
        {
            return vehicle;
        }

        public String getLicensePlate() 
        {
            return licensePlate;
        }
//This method was suggested by eclipse.
		public String getOwnerAddress() 
		{
			// TODO Auto-generated method stub
			return null;
		}
    }