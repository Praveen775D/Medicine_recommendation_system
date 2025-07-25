@startuml
start

:System Initialization;

:Scan RFID Card;
if (RFID Valid?) then (Yes)
  :Scan Fingerprint;
  if (Fingerprint Match?) then (Yes)
    :Check Alcohol Level;
    if (Alcohol Detected?) then (Yes)
      :Ignition Blocked;
      :Alert Triggered;
      stop
    else (No)
      :Detect Seat Belt (Camera + DL);
      if (Seat Belt Worn?) then (Yes)
        :Check Heartbeat;
        if (Heartbeat Normal?) then (Yes)
          :Ignition Enabled;
          :Vehicle Starts;
          while (Vehicle Running?)
            :Continuous Monitoring;
            :Ultrasonic Proximity Alert;
            :Re-check Alcohol;
            :Re-check Heartbeat;
            :Seat Belt Status;
          endwhile
          stop
        else (No)
          :Display Warning;
          :Deny Ignition;
          stop
        endif
      else (No)
        :Trigger Buzzer;
        :Deny Start;
        stop
      endif
    endif
  else (No)
    :Access Denied;
    stop
  endif
else (No)
  :Access Denied;
  stop
endif

@enduml
