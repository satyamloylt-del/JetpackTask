package com.example.jetpacktask.ui.screen.labtest.component.topbookedhealthcheckup

import com.example.jetpacktask.model.TopBookedHealthCheckup

class TopBookedRepository {


        fun getData(): List<TopBookedHealthCheckup> {
            return listOf(
                TopBookedHealthCheckup("For Male & Female","Fit India Full Body Checkup with Vitamin screening free HsRP","Random Blood Sugar, Liver Function Test, Urine Routine, Complete Blood Count...","Tests Included 93 Test","Reports within 24 Hours","Fasting Required\n12 Hours","₹ 1050","₹7600","₹ 950"),
                TopBookedHealthCheckup("For Male & Female","Fit India Full Body Checkup with Vitamin screening free HsRP","Random Blood Sugar, Liver Function Test, Urine Routine, Complete Blood Count...","Tests Included 93 Test","Reports within 24 Hours","Fasting Required\n12 Hours","₹ 1050","₹7600","₹ 950"),
                TopBookedHealthCheckup("For Male & Female","Fit India Full Body Checkup with Vitamin screening free HsRP","Random Blood Sugar, Liver Function Test, Urine Routine, Complete Blood Count...","Tests Included 93 Test","Reports within 24 Hours","Fasting Required\n12 Hours","₹ 1050","₹7600","₹ 950"),
                TopBookedHealthCheckup("For Male & Female","Fit India Full Body Checkup with Vitamin screening free HsRP","Random Blood Sugar, Liver Function Test, Urine Routine, Complete Blood Count...","Tests Included 93 Test","Reports within 24 Hours","Fasting Required\n12 Hours","₹ 1050","₹7600","₹ 950")
            )

    }
}