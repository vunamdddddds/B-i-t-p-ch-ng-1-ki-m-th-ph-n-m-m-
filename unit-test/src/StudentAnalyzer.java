import java.util.List;

public class StudentAnalyzer {
    /**
     * Phân tích điểm số và trả về số lượng học sinh đạt loại Giỏi.
     * 
     * @param scores danh sách điểm số từ 0 đến 10
     * @return số học sinh đạt loại Giỏi (>= 8.0)
     *         - Bỏ qua điểm âm hoặc lớn hơn 10 (coi là dữ liệu sai)
     *         - Nếu danh sách rỗng, trả về 0
     */
    public int countExcellentStudents(List<Double> scores) {
        // TODO: Sinh viên viết mã tại đây
        if (!scores.isEmpty()) {
            int countGoodStudent = 0;
            for (Double scDouble : scores) {

                if (scDouble < 0 || scDouble > 10) {
                    continue;
                } else {
                    if (scDouble >= 8.0) {
                        countGoodStudent++;
                    }
                }

            }
            return countGoodStudent;
        }
        return 0;
    }

    /**
     * Tính điểm trung bình hợp lệ (từ 0 đến 10)
     * 
     * @param scores danh sách điểm
     * @return điểm trung bình của các điểm hợp lệ
     */
    
    public double calculateValidAverage(List<Double> scores) {
        // TODO: Sinh viên viết mã tại đây
        if (!scores.isEmpty()) {
            int count = 0;
            Double scoresTotal = 0.0;
            for (Double scDouble : scores) {

                if (scDouble < 0 || scDouble > 10) {
                    continue;
                } else {
                    scoresTotal += scDouble;
                    count++;
                }

            }
            return scoresTotal / count;
        }
        return 0;
    }
}
