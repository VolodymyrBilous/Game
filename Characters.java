public abstract class Characters {
    WeaponBehavior weapon;
    
	public Characters() {
		// TODO Auto-generated constructor stub
	}
    public void fight(){
    	weapon.useWeapon();
    }
    public void setWeapon(WeaponBehavior weapon){
    	this.weapon = weapon;
    }
    
}
