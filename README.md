# B-i-t-p-ch-ng-1-ki-m-th-ph-n-m-m-


I.Viết hàm countExcellentStudents():

-Mô tả cách hoạt động : 

1. Hàm countExcellentStudents nhận vào 1 danh sách kiểu Double (số thực) (nơi chứa danh sách các điểm ) và trả về kiểu int (số nguyên)

2. Đầu tiên check điều kiện nếu danh sách trống thì trả về giá trị 0 (mặc định )

3. Tiếp theo khởi báo int countGoodStudent và khởi tạo = 0 : đếm số lượng học sinh giỏi (>=8.0)

4. Tiếp theo tạo vòng foreach lặp qua từng giá trị trong danh sách 

5. Tiếp theo trong vòng foreach check kiểm tra giá trị có hợp lệ không (scDouble < 0 || scDouble > 10) nếu thỏa mãn thì bỏ qua giá trị đó , nếu không thỏa mãn thì đến bước kiểm tra giá trị có thỏa mãn điều kiện (>=8.0) nếu thỏa mãn thì giá trị countGoodStudent tăng lên 1 

6. Sau khi duyệt hết giá trị trong danh sách thì trả về giá trị countGoodStudent , đó chính là số lượng học sinh giỏi 


II.Viết hàm calculateValidAverage():

-Mô tả cách hoạt động :

1. Hàm calculateValidAverage nhận vào 1 danh sách kiểu Double (số thực) (nơi chứa danh sách các điểm ) và trả về kiểu Doublt (số thực)
 
2. Đầu tiên check điều kiện nếu danh sách trống thì trả về giá trị 0 (mặc định )

3. Tiếp theo khởi báo int count và khởi tạo = 0 : đếm số lượng điểm 

4. Tiếp theo khởi báo Double scoresTotal và khởi tạo = 0.0 : đếm tổng số điểm 

5. Tiếp theo tạo 1 vòng for duyệt từng giá trị trong danh sách 

6. Tiếp theo trong vòng for kiểm tra điều kiện nếu điểm không hợp lệ (scDouble < 0 || scDouble > 10) thì bỏ qua còn nếu điểm hợp lệ thì biến scoresTotal sẽ được cập nhật cộng giá trị trước đó của chính nó với giá trị hiện tại mà vòng lặp duyệt qua thỏa mãn các điều kiện , cùng lúc đó tăng giá trị count lên 1 đơn vị 

7. Sau khi  vòng for duyệt qua hết danh sách thì trả về giá trị trung bình (scoresTotal / count)






