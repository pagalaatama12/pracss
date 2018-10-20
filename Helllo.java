class Helllo
{
public static void showBytes() 
{
    try
	{
		Unsafe unsafe = getUnsafe();
		
		byte value = Byte.MAX_VALUE;
		long bytes = 1;	
		unsafe.putAddress(memoryAddress, value); // or putByte
		long memoryAddress = unsafe.allocateMemory(bytes);
		System.out.println("[Byte] Writing " + value + " under the " + memoryAddress + " address.");
		long readValue = unsafe.getAddress(memoryAddress); // or getByte
			
	}
}
	public static void main(String args[])
	{
		showBytes();
	}
}