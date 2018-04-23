import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class vote_cast {
	
	ArrayList<evmclass>_candidates = new ArrayList<evmclass>();
	String vote_id;

  	public vote_cast (String id)
	{
		 vote_id = id;
	};

	 public void addVote(evmclass arg) {
	     _candidates.add(arg);
	   }
	
	 public String getVoteID ()
	 {
		 return vote_id;
	 };
	 
	 
	 
	 public String vote_result()
	 {
		 int vote1=0;
		 int vote2=0;
		
		 Enumeration<evmclass> candidates = Collections.enumeration(_candidates);
		 System.out.println("\n******************************************\n");
		 System.out.println("\n******************************************\n");
		 
		 String result = "FINAL VOTING RESULTS \n" ;
		
		 while(candidates.hasMoreElements())
		 {
			
			 evmclass each = (evmclass) candidates.nextElement();
			 
			 if(each.getCandidate().getCand_id() == "100")
			 {
				
				 vote1=vote1+each.getCandidate().votes;
				
			 }
			 else if(each.getCandidate().getCand_id() == "101")
			 {
				
				 vote2=vote2+each.getCandidate().votes;
				
			 }
			 
			 result += "\t" + each.getCandidate().getCand_name() + "\t" + each.getCandidate().getCand_constituency() +"\n";

			  }
		 return result;
		 
		 }
	  
}



