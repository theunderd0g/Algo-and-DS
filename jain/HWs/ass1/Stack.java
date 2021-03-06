package ass1;
public class Stack<gene>
{
    private gene[] stack;
    private int idx=0;
    private int capacity = 2;
    public Stack()
      {
        stack = (gene[])new Object[capacity];
      }
     private int getcapacity(){return stack.length;}
     
	 private void reSize(int newcapacity)
     {
         gene[] temp = (gene[]) new Object[newcapacity];
         for(int i=0;i<idx;++i)
         	temp[i]=stack[i];
         stack=temp;
      }

      public void push(gene item)
      {
		if(idx==stack.length)
			reSize(2*stack.length);
		stack[idx++]=item;
      }
     
 	  public gene top()
      {
		  return stack[idx-1];
      }
      public gene pop()
	  {
          if(idx>1&&idx==capacity/4)
            reSize(stack.length/2);
		  return stack[--idx];
	  }
	  public void clear()
	  {
		  reSize(2);
		  idx = 0;
	  }  
	  public Boolean isempty()
	  {
		  return idx == 0;
	  }
  }
