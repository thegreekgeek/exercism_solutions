public class FootballMatchReports {    
    public static String onField(int shirtNum) {
	String role = "";
        switch (shirtNum) {
	case 1:
	    role = "goalie";
	    break;
	case 2:
	    role = "left back";
	    break;
	case 3:
	case 4:
	    role = "center back";
	    break;
	case 5:
	    role = "right back";
	    break;
	case 6:
	case 7:
	case 8:
	    role = "midfielder";
	    break;
	case 9:
	    role = "left wing";
	    break;
	case 10:
	    role = "striker";
	    break;
	case 11:
	    role = "right wing";
	    break;
	default:
	    role = "invalid";	  
	}
	return role;
    }
}
