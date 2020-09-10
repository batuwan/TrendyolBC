
package com.mycompany._notificationhub.Sender;

import com.mycompany._notificationhub.Company;

public interface Channel {
    void Send(String messageBody);
    void increaseCount(Company company);
    
}
