package inter;

import bean.Ownerbean;
import bean.Uploadbean;
import bean.Userbean;

public interface Inter {
	
	public int oreg(Ownerbean owr);
	public boolean olog(Ownerbean owl);
	
	public int ureg(Userbean usr);
	public boolean ulog(Userbean usl);
	
	public int file(Uploadbean upb);
	public int key(Uploadbean upk);
	
	public int req(Uploadbean rq);
    public int rep(Uploadbean rp);

    
   
    
}
