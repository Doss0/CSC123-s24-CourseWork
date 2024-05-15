import java.util.Date;

public class Citation 
    {
        private Date date;
        private int offenseCode;
        private double amount;
        private Registration registration;

        public Citation(Date date, int offenseCode, double amount, Registration registration) 
        {
            this.date = date;
            this.offenseCode = offenseCode;
            this.amount = amount;
            this.registration = registration;
        }

        public Date getDate() 
        {
            return date;
        }

        public int getOffenseCode() 
        {
            return offenseCode;
        }

        public double getAmount() 
        {
            return amount;
        }
    }
