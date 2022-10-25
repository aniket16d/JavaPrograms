package javaBasics;


public class Question1 {

	public static void main(String[] args) {
		
			
			int n=10;
			
			for(int i=0;i<n;i++)
		    {
			
				//letter A
			    for(int j = 0; j < n; j++)
			    	
			   {
				 if(j==0 && i!=0 || j==n-1 && i!=0 || i==0 && j!=0 && j!=n-1 || i==(n-1)/2 && j!=0 && j!=n-1 )
				  {
					System.out.print("* ");
				  }
				 else
				  {
					System.out.print("  ");
				  }
			   }
			System.out.print(" ");
			
			    //letter N
			    for(int j=0;j<n;j++)
			    	
			  {
				if(j==0 || j==i || j==n-1)
				 {
				    System.out.print("* ");
				 }
				else 
				 {
					System.out.print("  ");
				 }
			  }
			System.out.print(" ");
			  
			    //letter I
			    for(int j=0;j<n;j++)
			    	
			   {
				 if(i==0 || j==(n-1)/2 || i==n-1)
				  {
					System.out.print("* ");
				  }
				else
				  {
					System.out.print("  ");
				  }
			   }
			System.out.print(" ");
			
			    //letter K
			
			    for (int j=0;j<n;j++)
			    {
				  if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2)
				  {
					System.out.print("* ");
				  }
				  else
				  {
					System.out.print("  ");
				  }
					
			     }
			
			System.out.print(" ");
			
			//letter E
			
			    for(int j=0;j<n;j++)
			   {
				  if(i==0 || i==(n-1)/2 || i==n-1 || j==0)
				  {
				    System.out.print("* ");
				  }
				  else
				  {
					System.out.print("  ");
				  }
			   }
			System.out.print("  ");
			
			//letter T
			    for(int j=0;j<n;j++)
			  {
				  if(i==0 || j==(n-1)/2 )
				  {
					System.out.print("* ");
				  }
				
				  else
			      {
					System.out.print("  ");
				  }
				  
			   }
			System.out.print("  ");
			System.out.print("        ");
			
			
			{
			
			
		     //letter I
			    for(int j=0;j<n;j++)
			    	
			{
				if(i ==0 || j==(n-1)/2 || i==n-1)
				{
				  System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			//letter N
			
				for(int j=0;j<n;j++)
				{
					if(j==0 || j==i || j==n-1)
					{
					    System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.print("  ");
				
				//letter E
				
					for(int j=0;j<n;j++)
					{
						if(i==0 || i==(n-1)/2 || i==n-1 || j==0)
						{
						     System.out.print("* ");
						}
						else
						{
							System.out.print("  ");
							
						}
					}
					System.out.print("  ");
					
					//letter U
					
						for(int j=0;j<n;j++)
						{
							if(j==0 && i!=n-1 || i==n-1 && j!=0 && j!=n-1 || j==n-1 && i!=n-1)
							{
							    System.out.print("* ");
							}
							else
							{
								System.out.print("  ");
								
							}
						}
						System.out.print("  ");
						
						
						
						//letter R
						
							 for(int j=0;j<n;j++)
							{
								if(j==0 || i==0 && j<n-4 || j==n-4 && i<=(n-1)/2 || i==(n-1)/2 && j<n-4 || i-j==(n-1)/2)
								{
								   System.out.print("* ");
								}
								else
								{
									System.out.print("  ");
								}
							}
							System.out.print(" ");  
							
							//letter O
							
								for(int j=0;j<n;j++)
								{
									if(i==0 && j!=0 && j!=n-1 || j==0 && i!=0 && i!=n-1 || j==n-1 && i!=0 && i!=n-1 || i==n-1 && j!=0 && j!=n-1)
									{
									  System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}
								System.out.print("  ");
								
								//letter N
								
									for(int j=0;j<n;j++)
									{
										if(j==0 || j==i || j==n-1)
										{
										   System.out.print("* ");
										}
										else
										{
											System.out.print("  ");
										}
									}
									System.out.println();
									
								}
							}
						
					
                        }
}
			
			
	

	

		
		
		
		


