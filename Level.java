import java.util.List;
import java.util.ArrayList;

public class Level{
  private List <Block> blocks;
  private List <Record> records;
  private GoalRecord goal;
  private Point startingPoint;
  
  public Level(List <Block> b, List <Record> r, GoalRecord g, Point s){
    this.blocks = b;
    this.records = r;
    this.goal = g;
    this.startingPoint = s;
    return;
  }
  
  public Point getStartingPoint(){
    return this.startingPoint;
  }
  
  public List <Record> getRecords(){
    return this.records;
  }
  
  public List <Block> getBlocks(){
    return this.blocks;
  }
  
  public GoalRecord getGoal(){
    return this.goal;
  }
  
}