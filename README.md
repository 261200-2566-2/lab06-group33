# (Lab 6 ข้อ 2)

# What you've already done well
* ลดการ code duplication มาระดับหนึ่ง
* มีการใช้ try-catch ดักการ error ของ code
* มีการใช้ Scanner เพื่อเล่น RPG Game (ลองเล่นได้โดย run Main.java)


# What could be improved

* Declare variables, methods ให้ตรงตาม naming conventions
* ใช้ enum สําหรับ skill
* ใส่ comment ตรงที่ code มันเข้าใจยากให้คนที่จะมาดู code ได้เข้าใจ
* เพิ่มคำอธิบายสกิลและดาเมจของสกิลตอนเล่นเพื่อให้เกมเล่นง่ายขึ้น


# Mistake

* เขียน method, variable แต่ไม่ได้ใช้  เช่น levelup() และ chooseCharacter()
* code อ่านยากเพราะตอนแรกไม่คิดว่าจะมีคนมาอ่านเลยเขียน code แบบตามใจตัวเอง
* implementing handling user's interface ใน main class
* class Accessory รวมไปถึง subclass ยังมี implementation ที่น้อยเกินไป
* ไม่สามารถทำให้ dodge() และ evade() 

