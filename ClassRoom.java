public class ClassRoom
{
    private String  roomNr;
    private boolean computer;
    private int     size;
    private boolean beamer;
    private boolean windows;
    
    public void setBeamer(boolean newBeamer)
    {
        beamer = newBeamer;
    }
    
    public void setWindows(boolean newWindows)
    {
        windows = newWindows;
    }
    
    public void setRoomNr(String newRoomNr)
    {
        roomNr = newRoomNr;
    }
    
    public void setComputer(boolean newComputer)
    {
        computer = newComputer;
    }
    
    public void setSize(int newSize)
    {
        size = newSize;
    }

    public String getRoomNr()
    {
        return roomNr;
    }
    
    public boolean getComputer()
    {
        return computer;
    }
    
    public int getSize()
    {
        return size;
    }
    
    public boolean getWindows()
    {
        return windows;
    }
    
    public boolean getBeamer()
    {
        return beamer;
    }
}
