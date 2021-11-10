/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap8bai6;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author ADMIN
 */
public class socket_tong2so {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException  {
        System.out.println("Client dang ket noi voi Server... ");
        String a, b, tong;
        //tạo socket để kết nối tới Server, Locallhost: Server mặc định
        Socket ClientSocket = new Socket("Localhost", 1234);
        //thong bao da ket noi thanh cong 
        System.out.println("Da ket noi voi Server! ");
        //tao luong nhap du lieu tu ban phim 
        DataInputStream inFromUser = new DataInputStream(System.in);
        //tao luong nhan du lieu tu Server
        DataInputStream inFromServer = DataInputStream(ClientSocket.getInputStream());
        //tao luong gui du lieu len Server
        DataOutputStream outToServer = new DataOutputStream(ClientSocket.getOutputStream());
        // nhap du lieu tu ban phim
        try {
            System.out.println("\n Nhap a :");
            a = inFromUser.readLine();
            System.out.println("\n Nhap b :");
            b = inFromUser.readLine();
            // gui len Server
            outToServer.writeBytes(a + '\n');
            outToServer.writeBytes(b + '\n');
        } catch (UnknownHostException e) 
        {
            InterruptedException("Server Not Found");
            System.exit(1);
        } catch (IOException e) 
        {
            InterruptedException("Cannot make a connection");
        }
        //nhan ve tu Server
        tong = inFromServer.readLine();
        //in ra man hinh 
        System.out.println("\n Ket qua :" + tong);
        //dong luong gui du lieu len Server
        outToServer.close();
        //dong luong nhan du lieu tu Server
        inFromServer.close();
        ClientSocket.close();
    }
}


