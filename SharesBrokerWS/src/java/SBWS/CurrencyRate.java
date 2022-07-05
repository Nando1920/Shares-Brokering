/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SBWS;

/**
 *
 * @author ftama
 */
public class CurrencyRate {
    
    private String Name;
        private String Code;
        private Object Rate;
        CurrencyRate(){};
        CurrencyRate(String name, String code, Object rate){
            this.Name = name;
            this.Code = code;
            this.Rate = rate;
       };

        public void setName(String Name) {
            this.Name = Name;
        }
        public void setCode(String Code) {
            this.Code = Code;
        }

        public void setRate(Object Rate) {
            this.Rate = Rate;
        }

        public String getName() {
            return Name;
        }

        public String getCode() {
            return Code;
        }
  
        public Object getRate() {
            return Rate;
        }
    
}
